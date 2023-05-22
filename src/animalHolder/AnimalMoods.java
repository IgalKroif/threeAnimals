package animalHolder;

/**
 * The {@code AnimalMoods} enum represents the possible moods of an animal.
 * It provides two mood options: GOOD_MOOD and SCARED.
 */
public enum AnimalMoods {

    /**
     * Represents a good mood of an animal.
     */
    GOOD_MOOD(0),

    /**
     * Represents a scared mood of an animal.
     */
    SCARED(1);

    private final int value;

    /**
     * Constructs an {@code AnimalMoods} enum constant with the specified value.
     *
     * @param value the value associated with the mood
     */
    AnimalMoods(int value) {
        this.value = value;
    }

    /**
     * Returns the value associated with the mood.
     *
     * @return the value of the mood
     */
    public int getValue() {
        return value;
    }
}