for (String word : splitted) {
                if (numbers.get(word) == null && onumbers.get(word) == null && tnumbers.get(word) == null) {
                    if (flag) {
                        System.out.print("Invalid word/s found : ");
                        flag = false;
                    }
                    System.out.print(word + " ");
                    IsValid = false;
                }