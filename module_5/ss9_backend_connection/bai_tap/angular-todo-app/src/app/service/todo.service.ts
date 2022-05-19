import {Injectable} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Todo} from "../model/todo";
import {Observable} from "rxjs";

const API_URL = "http://localhost:3000/todo";

@Injectable({
  providedIn: 'root'
})
export class TodoService {


  constructor(private httpClient: HttpClient) {
  }

  getAll(): Observable<Todo[]> {
    return this.httpClient.get<Todo[]>(API_URL);
  }

  save(todo: Todo): Observable<Todo> {
    return this.httpClient.post<Todo>(API_URL, todo);
  }

  findById(id: number): Observable<Todo> {
    return this.httpClient.get<Todo>(`${API_URL}/${id}`);
  }

  update(id: number, todo: Todo): Observable<Todo> {
    return this.httpClient.put<Todo>(`${API_URL}/${id}`, todo);
  }

  delete(id: number): Observable<Todo> {
    return this.httpClient.delete<Todo>(`${API_URL}/${id}`);
  }
}
