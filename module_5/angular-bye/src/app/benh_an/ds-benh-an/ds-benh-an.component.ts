import {Component, OnInit} from '@angular/core';
import {BenhAn} from '../../model/benh-an';
import {BenhAnService} from '../../service/benh-an.service';
import {FormControl, FormGroup, Validators} from '@angular/forms';

@Component({
  selector: 'app-ds-benh-an',
  templateUrl: './ds-benh-an.component.html',
  styleUrls: ['./ds-benh-an.component.css']
})
export class DsBenhAnComponent implements OnInit {
  dsBenhAn: BenhAn[] = [];
  benhAn: BenhAn;

  constructor(private benhAnService: BenhAnService) {

  }

  ngOnInit() {
    this.getAllBenhAn();
  }

  getAllBenhAn() {
    this.benhAnService.getAll().subscribe(benhAn =>
      this.dsBenhAn = benhAn);
  }

  deleteConfirm(id: number) {
    if (confirm('Xác nhận : Bạn có muốn xóa thông tin bệnh án này hay không?')) {
      this.deleteBenhAn(id);
    }
  }

  deleteBenhAn(id: number) {
    this.benhAnService.deleteBenhAn(id).subscribe(data => {
        this.ngOnInit();
      }
    );
  }
}
