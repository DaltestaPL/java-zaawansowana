package zadania.zadanie24_i_25;


import static zadania.zadanie24_i_25.ExceptionMessages.BASKET_EMPTY_EXCEPTION;
import static zadania.zadanie24_i_25.ExceptionMessages.BASKET_FULL_EXCEPTION;

/**
 * Stwórz klasę Basket, która imituje koszyk i przechowuje aktualną ilość elementów w koszyku.
 * Dodaj metodę addToBasket(),
 * która dodaje element do koszyka (zwiększając aktualny stan o 1) oraz metodę removeFromBasket(),
 * która usuwa element z koszyka (zmniejszając aktualny stan o 1).
 *
 * Koszyk może przechowywać od 0 do 10 elementów.
 * W przypadku, kiedy użytkownik chce wykonać akcję usunięcia przy stanie 0 lub dodania przy stanie 10,
 * rzuć odpowiedni runtime exception (BasketFullException lub BasketEmptyException).
 */
public class Basket {

    private Integer quantity;

    public Basket() {
        this.quantity = 0;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void addToBasket() throws BasketFullException {
        if (this.quantity == 10) {
            throw new BasketFullException(BASKET_FULL_EXCEPTION.getMessage());
        } else {
            this.quantity += 1;
        }
    }

    public void removeFromBasket() throws BasketEmptyException {
        if (this.quantity <= 0) {
            throw new BasketEmptyException(BASKET_EMPTY_EXCEPTION.getMessage());
        } else {
            this.quantity -= 1;
        }
    }
}
