package sia.tacos.data;

import org.springframework.data.repository.CrudRepository;

import sia.tacos.Ingredient;

public interface IngredientRepository extends CrudRepository<Ingredient, String> {
}
