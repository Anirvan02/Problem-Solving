class Solution {
    public List<String> letterCombinations(String digits) {
        if(digits == null || digits.length() == 0) {
            return new ArrayList<>();
        }

        String[] num = {"2", "3", "4", "5", "6", "7", "8", "9"};
        String[] letter = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        String[] numLetter = new String[digits.length()];

        for(int i = 0; i < digits.length(); i++) {
            for(int j = 0; j < num.length; j++) {
                if(digits.charAt(i) == num[j].charAt(0)) {
                    numLetter[i] = letter[j];
                }
            }
        }

        List<String> res = new ArrayList<>();
        permute(res, new StringBuilder(), numLetter, 0);

        return res;
    }

    private void permute(List<String> res, StringBuilder combination, String[] numLetter, int index) {
        if (index == numLetter.length) {
            res.add(combination.toString());
            return;
        }

        String letters = numLetter[index];
        for (char letter : letters.toCharArray()) {
            combination.append(letter);
            permute(res, combination, numLetter, index + 1);
            combination.deleteCharAt(combination.length() - 1);
        }
    }
}
