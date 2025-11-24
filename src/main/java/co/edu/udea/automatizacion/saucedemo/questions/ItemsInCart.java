package co.edu.udea.automatizacion.saucedemo.questions;

import java.util.ArrayList;
import java.util.List;

import co.edu.udea.automatizacion.saucedemo.userinterfaces.CartPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ItemsInCart implements Question<List<String>> {

    public static ItemsInCart displayed() {
        return new ItemsInCart();
    }

    @Override
    public List<String> answeredBy(Actor actor) {
        return new ArrayList<>(Text.ofEach(CartPage.CART_ITEM_NAMES).answeredBy(actor));
    }

}
