package dmacc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import dmacc.beans.ShoppingList;

public interface ShoppingListReposity extends JpaRepository<ShoppingList, Long> {

}
