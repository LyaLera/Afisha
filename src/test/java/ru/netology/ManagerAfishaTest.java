package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ManagerAfishaTest {
    ManagerAfisha manager = new ManagerAfisha();
    ManagerAfisha manager1 = new ManagerAfisha(4);
    ManagerAfisha manager2 = new ManagerAfisha(-1);

    Movie first = new Movie(1, "Бладшот", "боевик");
    Movie second = new Movie(2, "Вперёд", "мультфильм");
    Movie third = new Movie(3, "Отель Белград", "комедия");
    Movie fourth = new Movie(4, "Джентельмены", "боевик");
    Movie fifth = new Movie(5, "Человек-невидимка", "ужасы");
    Movie sixth = new Movie(6, "Тролли. Мировой тур", "мультфильм");
    Movie seventh = new Movie(7, "Номер один", "комедия");
    Movie eighth = new Movie(8, "Мой волк", "приключение");
    Movie ninth = new Movie(9, "Последний богатырь: Посланник Тьмы", "приключение");
    Movie tenth = new Movie(10, "Чемпион мира", "драма");

    @Test
    public void shouldGetLastsTen() {
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);

        manager.getLasts();

        Movie[] actual = manager.getLasts();
        Movie[] expected = new Movie[]{tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldGetLastsLessTen() {
        manager1.add(first);
        manager1.add(second);
        manager1.add(third);
        manager1.add(fourth);
        manager1.add(fifth);

        manager1.getLasts();

        Movie[] actual = manager1.getLasts();
        Movie[] expected = new Movie[]{fifth, fourth, third, second, first};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldGetLastsLessZero() {

        manager2.getLasts();

        Movie[] actual = manager2.getLasts();
        Movie[] expected = new Movie[]{};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldGetLastsIfOverLimit() {

        manager1.add(first);
        manager1.add(second);
        manager1.add(third);
        manager1.add(fourth);
        manager1.add(fifth);
        manager1.add(sixth);
        manager1.add(seventh);

        manager1.getLasts();

        Movie[] actual = manager1.getLasts();
        Movie[] expected = new Movie[]{fifth, fourth, third, second, first};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldGetLastsIfUnderLimit() {

        manager1.add(first);
        manager1.add(second);
        manager1.add(third);
        manager1.add(fourth);

        manager1.getLasts();

        Movie[] actual = manager1.getLasts();
        Movie[] expected = new Movie[]{fourth, third, second, first};
        assertArrayEquals(expected, actual);
    }
}