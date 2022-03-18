import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FoodListComponent } from './food-list/food-list.component';
import { AddFoodComponent } from './add-food/add-food.component';
import { FoodSearchComponent } from './food-search/food-search.component';
import { AddFoodToCartComponent } from './add-food-to-cart/add-food-to-cart.component';
import { NavbarComponent } from './navbar/navbar.component';
import { CheckoutComponent } from './checkout/checkout.component';
import { OrderConfirmationComponent } from './order-confirmation/order-confirmation.component';
import { PaymentComponent } from './payment/payment.component';
import { RemoveFoodComponent } from './remove-food/remove-food.component';
import { ViewCartComponent } from './view-cart/view-cart.component';

@NgModule({
  declarations: [
    AppComponent,
    FoodListComponent,
    AddFoodComponent,
    FoodSearchComponent,
    AddFoodToCartComponent,
    NavbarComponent,
    CheckoutComponent,
    OrderConfirmationComponent,
    PaymentComponent,
    RemoveFoodComponent,
    ViewCartComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
