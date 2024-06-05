package dragon;

// FIXME убрать из пакета // FIXED
public class IdGenerator {

    private static IdGenerator instance = null;
    private Long idSequence = 1L;

    private IdGenerator() {
    }

    public static IdGenerator getInstance() {
        if (instance == null) {
            instance = new IdGenerator();
        }
        return instance;
    }

    public Long getId() {
        return this.idSequence++;
    }

}

