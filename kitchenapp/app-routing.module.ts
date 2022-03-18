import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddFoodToCartComponent } from './add-food-to-cart/add-food-to-cart.component';
import { AddFoodComponent } from './add-food/add-food.component';
import { CheckoutComponent } from './checkout/checkout.component';
import { FoodListComponent } from './food-list/food-list.component';
import { FoodSearchComponent } from './food-search/food-search.component';
import { OrderConfirmationComponent } from './order-confirmation/order-confirmation.component';
import { PaymentComponent } from './payment/payment.component';
import { RemoveFoodComponent } from './remove-food/remove-food.component';
import { ViewCartComponent } from './view-cart/view-cart.component';

const routes: Routes = [
  {path:"", redirectTo:'/home', pathMatch:'full'},
  {path:"food-list", component:FoodListComponent},
  {path:"add-food", component:AddFoodComponent},
  {path:"remove-food", component:RemoveFoodComponent},
  {path:"food-search", component:FoodSearchComponent},
  {path:"add-food-to-cart", component:AddFoodToCartComponent},
  {path:"view-cart", component:ViewCartComponent},
  {path:"checkout", component:CheckoutComponent},
  {path:"payment", component:PaymentComponent},
  {path:"order-confirmation", component:OrderConfirmationComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
