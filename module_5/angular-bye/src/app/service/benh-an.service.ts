import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {BenhAn} from '../model/benh-an';

const API_URL = 'http://localhost:3000';

@Injectable({
  providedIn: 'root'
})
export class BenhAnService {

  constructor(private http: HttpClient) {

  }
  getAll(): Observable<BenhAn[]> {
    return this.http.get<BenhAn[]>(API_URL + '/dsBenhAn');
  }

  saveBenhAn(benhAn): Observable<BenhAn> {
    return this.http.post<BenhAn>(API_URL + '/dsBenhAn', benhAn);
  }

  findById(id: number): Observable<BenhAn> {
    return this.http.get<BenhAn>(`${API_URL}/dsBenhAn/${id}`);
  }

  updateBenhAn(id: number, benhAn: BenhAn): Observable<BenhAn> {
    return this.http.put<BenhAn>(`${API_URL}/dsBenhAn/${id}`, benhAn);
  }

  deleteBenhAn(id: number): Observable<BenhAn> {
    return this.http.delete<BenhAn>(`${API_URL}/dsBenhAn/${id}`);
  }


}
