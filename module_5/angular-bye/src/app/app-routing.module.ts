import {NgModule} from '@angular/core';
import {Routes, RouterModule} from '@angular/router';
import {DsBenhAnComponent} from './benh_an/ds-benh-an/ds-benh-an.component';
import {EditComponent} from './benh_an/edit/edit.component';


const routes: Routes = [
  {
    path: '',
    // loadChildren: () => import('./student/student.module').then(module=> module.StudentModule)
    component: DsBenhAnComponent
  },
  {
    path: 'edit/:id',
    component: EditComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
}
