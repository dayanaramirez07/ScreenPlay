package co.edu.udea.automatizacion.saucedemo.questions;

import co.edu.udea.automatizacion.saucedemo.userinterfaces.ProductsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class CartItemCount implements Question<Integer> {

    public static CartItemCount displayed() {
        return new CartItemCount();
    }

    @Override
    public Integer answeredBy(Actor actor) {
        String count = Text.of(ProductsPage.CART_BADGE).answeredBy(actor);
        return Integer.parseInt(count);
    }

}
