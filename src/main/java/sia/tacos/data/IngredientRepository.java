package sia.tacos.data;

import java.util.Optional;

import org.springframework.data.repository.Repository;

import sia.tacos.Ingredient;

public interface IngredientRepository extends Repository<Ingredient, String> {
    
    Iterable<Ingredient> findAll();

    Optional<Ingredient> findById(String id);

    Ingredient save(Ingredient ingredient);
}
