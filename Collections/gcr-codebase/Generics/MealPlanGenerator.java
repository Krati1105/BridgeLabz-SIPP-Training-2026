public class MealPlanGenerator {
    public interface MealPlan {
        String getMealType();
    }

    public static class VegetarianMeal implements MealPlan {
        @Override
        public String getMealType() {
            return "Vegetarian";
        }

        @Override
        public String toString() {
            return "VegetarianMeal";
        }
    }

    public static class VeganMeal implements MealPlan {
        @Override
        public String getMealType() {
            return "Vegan";
        }

        @Override
        public String toString() {
            return "VeganMeal";
        }
    }

    public static class KetoMeal implements MealPlan {
        @Override
        public String getMealType() {
            return "Keto";
        }

        @Override
        public String toString() {
            return "KetoMeal";
        }
    }

    public static class HighProteinMeal implements MealPlan {
        @Override
        public String getMealType() {
            return "High-Protein";
        }

        @Override
        public String toString() {
            return "HighProteinMeal";
        }
    }

    public static class Meal<T extends MealPlan> {
        private final T plan;

        public Meal(T plan) {
            this.plan = plan;
        }

        public T getPlan() {
            return plan;
        }

        @Override
        public String toString() {
            return "Meal{" + "plan=" + plan + '}';
        }
    }

    public static <T extends MealPlan> Meal<T> createMealPlan(T mealPlan) {
        if (mealPlan == null) {
            throw new IllegalArgumentException("Meal plan cannot be null");
        }
        System.out.println("Generating personalized " + mealPlan.getMealType() + " meal plan.");
        return new Meal<>(mealPlan);
    }

    public static void main(String[] args) {
        Meal<VegetarianMeal> vegMeal = createMealPlan(new VegetarianMeal());
        Meal<VeganMeal> veganMeal = createMealPlan(new VeganMeal());
        Meal<KetoMeal> ketoMeal = createMealPlan(new KetoMeal());
        Meal<HighProteinMeal> proteinMeal = createMealPlan(new HighProteinMeal());

        System.out.println(vegMeal);
        System.out.println(veganMeal);
        System.out.println(ketoMeal);
        System.out.println(proteinMeal);
    }
}
