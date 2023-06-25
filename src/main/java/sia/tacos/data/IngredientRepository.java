package sia.tacos.data;

import java.util.Optional;

import sia.tacos.Ingredient;

public interface IngredientRepository {
    
    Iterable<Ingredient> findAll();

    Optional<Ingredient> findById(String id);

    Ingredient save(Ingredient ingredient);
}
