import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterManagerTest {

    String film1 = "film1";
    String film2 = "film2";
    String film3 = "film3";
    String film4 = "film4";
    String film5 = "film5";
    String film6 = "film6";
    String film7 = "film7";
    String film8 = "film8";
    String film9 = "film9";
    String film10 = "film10";
    String film11 = "film11";
    String film12 = "film12";
    String film13 = "film13";
    String film14 = "film14";
    String film15 = "film15";

    @Test
    public void findAllTest() {

        PosterManager manager = new PosterManager();
        manager.addNewFilm(film1);
        manager.addNewFilm(film2);
        manager.addNewFilm(film3);

        String[] actual = manager.findAll();
        String[] expected = {film1, film2, film3};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastTest() {

        PosterManager manager = new PosterManager();
        manager.addNewFilm(film1);
        manager.addNewFilm(film2);
        manager.addNewFilm(film3);

        String[] actual = manager.findLast();
        String[] expected = {film3, film2, film1};

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void findLastMaxTest() {

        PosterManager manager = new PosterManager();
        manager.addNewFilm(film1);
        manager.addNewFilm(film2);
        manager.addNewFilm(film3);
        manager.addNewFilm(film4);
        manager.addNewFilm(film5);
        manager.addNewFilm(film6);
        manager.addNewFilm(film7);
        manager.addNewFilm(film8);
        manager.addNewFilm(film9);
        manager.addNewFilm(film10);

        String[] actual = manager.findLast();
        String[] expected = {film10, film9, film8, film7, film6, film5,film4, film3, film2, film1};

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void findLastAboveMaxTest() {

        PosterManager manager = new PosterManager();
        manager.addNewFilm(film1);
        manager.addNewFilm(film2);
        manager.addNewFilm(film3);
        manager.addNewFilm(film4);
        manager.addNewFilm(film5);
        manager.addNewFilm(film6);
        manager.addNewFilm(film7);
        manager.addNewFilm(film8);
        manager.addNewFilm(film9);
        manager.addNewFilm(film10);
        manager.addNewFilm(film11);

        String[] actual = manager.findLast();
        String[] expected = {film11, film10, film9, film8, film7, film6, film5,film4, film3, film2};

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void findLastUnderMaxTest() {

        PosterManager manager = new PosterManager();
        manager.addNewFilm(film1);
        manager.addNewFilm(film2);
        manager.addNewFilm(film3);
        manager.addNewFilm(film4);
        manager.addNewFilm(film5);
        manager.addNewFilm(film6);
        manager.addNewFilm(film7);
        manager.addNewFilm(film8);
        manager.addNewFilm(film9);

        String[] actual = manager.findLast();
        String[] expected = {film9, film8, film7, film6, film5,film4, film3, film2, film1};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastTestWithLimit2() {

        PosterManager manager = new PosterManager();
        manager.setLimit(2);
        manager.addNewFilm(film1);
        manager.addNewFilm(film2);
        manager.addNewFilm(film3);

        String[] actual = manager.findLast();
        String[] expected = {film3, film2};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastTestWithLimit15() {

        PosterManager manager = new PosterManager();
        manager.setLimit(15);
        manager.addNewFilm(film1);
        manager.addNewFilm(film2);
        manager.addNewFilm(film3);
        manager.addNewFilm(film4);
        manager.addNewFilm(film5);
        manager.addNewFilm(film6);
        manager.addNewFilm(film7);
        manager.addNewFilm(film8);
        manager.addNewFilm(film9);
        manager.addNewFilm(film10);
        manager.addNewFilm(film11);
        manager.addNewFilm(film12);
        manager.addNewFilm(film13);
        manager.addNewFilm(film14);
        manager.addNewFilm(film15);


        String[] actual = manager.findLast();
        String[] expected = {film15, film14, film13, film12, film11, film10, film9, film8, film7, film6, film5, film4, film3, film2, film1};

        Assertions.assertArrayEquals(expected, actual);
    }
}

