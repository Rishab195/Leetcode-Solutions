class Solution {
    public List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {
        int n = recipes.length;
        List<String> result = new ArrayList<>();
        boolean[] cooked = new boolean[n];
        Set<String> supply = new HashSet<>(Arrays.asList(supplies));

        boolean progress = true;
        while (progress) {
            progress = false;

            for (int i = 0; i < n; i++) {
                if (cooked[i]) {
                    continue;
                }

                boolean canCook = true;
                for (String ing : ingredients.get(i)) {
                    if (!supply.contains(ing)) {
                        canCook = false;
                        break;
                    }
                }

                if (canCook) {
                    supply.add(recipes[i]);
                    cooked[i] = true;
                    result.add(recipes[i]);
                    progress = true;
                }
            }
        }

        return result;
    }
}
