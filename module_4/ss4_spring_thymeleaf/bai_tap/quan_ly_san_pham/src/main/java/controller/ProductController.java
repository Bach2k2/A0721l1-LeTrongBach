package controller;

import model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import service.IProductService;
import service.ProductService;

import java.util.List;

@RequestMapping("product")
@Controller
public class ProductController {
    private static IProductService productService = new ProductService();

    @GetMapping("")
    public String index(Model model) {
        List<Product> productList = productService.getAllProducts();
        model.addAttribute("products", productList);
        return "index";
    }

    @GetMapping("/create")
    public String createProduct(Model model) {
        model.addAttribute("product", new Product());
        return "create";
    }

    @PostMapping("/create")
    public String save(@ModelAttribute("product") Product product, RedirectAttributes redirectAttributes) {
        product.setId((int) (Math.random() * 10000));
        productService.createProduct(product);
        redirectAttributes.addFlashAttribute("success","Tạo mới thành công");
        return "redirect:/product";
    }
    @GetMapping("/{id}/edit")
    public String updateForm(@PathVariable int id, Model model){
        model.addAttribute("product",productService.getById(id));
        return "/edit";
    }

    @PostMapping("/edit")
    public String updateProduct(@ModelAttribute ("product") Product product, RedirectAttributes redirectAttributes)
    {
        productService.updateProduct(product);
        redirectAttributes.addFlashAttribute("success","cập nhật thành công");
        return "redirect:/product";
    }

    @GetMapping("/{id}/delete")
    public String deleteForm(@PathVariable int id,Model model)
    {
        Product product=productService.getById(id);
        model.addAttribute("product",product);
        productService.deleteProduct(product);
        return "/delete";
    }

    @PostMapping("/delete")
    public String deleteProduct(@ModelAttribute("product") Product product, RedirectAttributes redirectAttributes)
    {
        productService.deleteProduct(product);
        redirectAttributes.addFlashAttribute("success","xóa thành công");
        return "redirect:/product";
    }
}
