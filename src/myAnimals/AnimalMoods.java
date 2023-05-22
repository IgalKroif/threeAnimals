package myAnimals;

public enum AnimalMoods {

        GOOD_MOOD(0),
        SCARED(1);


        public int value;

        AnimalMoods(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public int setValue(int value) {
            this.value = value;
            return value;
        }

    }

