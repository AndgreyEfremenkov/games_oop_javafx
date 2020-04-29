
package ru.job4j;

import org.junit.Test;
import ru.job4j.chess.Logic;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;
import ru.job4j.chess.firuges.black.*;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class LogicTest {
    @Test
    public void whenPawnOnTheWay() {
        Logic logic = new Logic();
        Figure bishop = new BishopBlack(Cell.C1);
        Figure pawn = new PawnBlack(Cell.E3);
        logic.add(bishop);
        logic.add(pawn);
        assertThat(logic.move(Cell.C1, Cell.G5), is(false));
    }

    @Test
    public void whenPawnOnTheEndWay() {
        Logic logic = new Logic();
        Figure bishop = new BishopBlack(Cell.C1);
        Figure pawn = new PawnBlack(Cell.G5);
        logic.add(bishop);
        logic.add(pawn);
        assertThat(logic.move(Cell.C1, Cell.G5), is(false));
    }

    @Test
    public void whenPawnOutOnTheWay() {
        Logic logic = new Logic();
        Figure bishop = new BishopBlack(Cell.C1);
        Figure pawn = new PawnBlack(Cell.B6);
        logic.add(bishop);
        logic.add(pawn);
        assertThat(logic.move(Cell.C1, Cell.G5), is(true));
    }

}