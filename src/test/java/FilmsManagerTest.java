import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmsManagerTest {


    @Test
    public void AddMovie() {
        FilmsManager manager = new FilmsManager(10);
        manager.add("film1");
        manager.add("film2");
        manager.add("film3");
        manager.add("film4");
        manager.add("film5");
        manager.add("film6");
        manager.add("film7");
        manager.add("film8");
        manager.add("film9");
        manager.add("film10");

        String[] actual = manager.findAll();
        String[] expected = {"film1", "film2", "film3", "film4", "film5", "film6", "film7", "film8", "film9", "film10"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void FindLast() {
        FilmsManager manager = new FilmsManager(10);
        manager.add("film1");
        manager.add("film2");
        manager.add("film3");
        manager.add("film4");
        manager.add("film5");

        String[] actual = manager.findLast();
        String[] expected = {"film5", "film4", "film3", "film2", "film1"};

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void FindLast2() {
        FilmsManager manager = new FilmsManager(10);
        manager.add("film1");

        String[] actual = manager.findLast();
        String[] expected = {"film1"};

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void findLast3() {
        FilmsManager manager = new FilmsManager(10);

        String[] actual = manager.findLast();
        String[] expected = {};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastMore() {
        FilmsManager manager = new FilmsManager(10);
        manager.add("film1");
        manager.add("film2");
        manager.add("film3");
        manager.add("film4");
        manager.add("film5");
        manager.add("film6");
        manager.add("film7");
        manager.add("film8");
        manager.add("film9");
        manager.add("film10");
        manager.add("film11");

        String[] actual = manager.findLast();
        String[] expected = {"film11", "film10", "film9", "film8", "film7", "film6", "film5", "film4", "film3", "film2"};

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void findLastTen() {
        FilmsManager manager = new FilmsManager(10);
        manager.add("film1");
        manager.add("film2");
        manager.add("film3");
        manager.add("film4");
        manager.add("film5");
        manager.add("film6");
        manager.add("film7");
        manager.add("film8");
        manager.add("film9");
        manager.add("film10");

        String[] actual = manager.findLast();
        String[] expected = {"film10", "film9", "film8", "film7", "film6", "film5", "film4", "film3", "film2", "film1"};

        Assertions.assertArrayEquals(expected, actual);
    }
}
