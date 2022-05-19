import {Component, OnInit} from '@angular/core';
import {FormControl, FormGroup, Validators} from '@angular/forms';
import {BenhAnService} from '../../service/benh-an.service';
import {ActivatedRoute, ParamMap, Route, Router} from '@angular/router';

@Component({
  selector: 'app-edit',
  templateUrl: './edit.component.html',
  styleUrls: ['./edit.component.css']
})
export class EditComponent implements OnInit {

  benhAnForm: FormGroup;
  id: number;

  constructor(private benhAnService: BenhAnService,
              private activatedRoute: ActivatedRoute, private router: Router) {
    this.activatedRoute.paramMap.subscribe((paramMap: ParamMap) => {
      this.id = Number(paramMap.get('id'));
      this.getBenhAn(this.id);
    });

  }

  ngOnInit() {
  }

  getBenhAn(id: number) {
    return this.benhAnService.findById(id).subscribe(
      benhAn => {
        this.benhAnForm = new FormGroup({
          maBenhAn: new FormControl(benhAn.maBenhAn),
          maBenhNhan: new FormControl(benhAn.maBenhNhan),
          // tslint:disable-next-line:max-line-length
          tenBenhNhan: new FormControl(benhAn.tenBenhNhan, Validators.compose([Validators.required, Validators.pattern('[A-Za-z ]{1-100}')])),
          // tslint:disable-next-line:max-line-length
          ngayNhapVien: new FormControl(benhAn.ngayNhapVien, [Validators.required, Validators.pattern('^\\\\d{4}\\\\-(0?[1-9]|1[012])\\\\-(0?[1-9]|[12][0-9]|3[01])$')]),
          // tslint:disable-next-line:max-line-length
          ngayRaVien: new FormControl(benhAn.ngayRaVien, [Validators.required, Validators.pattern('^\\\\d{4}\\\\-(0?[1-9]|1[012])\\\\-(0?[1-9]|[12][0-9]|3[01])$')]),
          lyDoNhapVien: new FormControl(benhAn.lyDoNhapVien, Validators.required),
          ppDieuTri: new FormControl(benhAn.ppDieuTri, Validators.required),
          bacSi: new FormControl(benhAn.bacSi, Validators.required)
        });
      });
  }

  updateBenhAn(id: number) {
    const benhAn = this.benhAnForm.value;
    this.benhAnService.updateBenhAn(id, benhAn).subscribe(() => {
      alert('Cập nhật thành công');
    });
    this.router.navigateByUrl('');
  }
}
