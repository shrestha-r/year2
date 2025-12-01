package practical_13;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Unit_13_Test {

    /* ---------- Token tests ---------- */
    @Test
    @DisplayName("Token recognises numeric literals")
    void tokenCreation_num() {
        Token t = new Token("3.14");
        assertEquals(Type.NUM, t.type);
        assertEquals(3.14, (Double) t.value, 1e-9);
    }

    @Test
    @DisplayName("Token recognises boolean literals")
    void tokenCreation_bool() {
        assertTrue((Boolean) new Token("true").value);
        assertFalse((Boolean) new Token("FALSE").value);
    }

    @Test
    @DisplayName("Token recognises comparison operators")
    void tokenCreation_comparison() {
        assertEquals(">", new Token(">").value);
        assertEquals("<", new Token("<").value);
    }

    @Test
    @DisplayName("Token recognises logical operators (case-insensitive)")
    void tokenCreation_logical() {
        assertEquals("AND", new Token("and").value);
        assertEquals("OR",  new Token("Or").value);
    }

    @Test
    @DisplayName("Token throws on unknown lexeme")
    void tokenCreation_invalid() {
        Exception ex = assertThrows(IllegalArgumentException.class,
                                    () -> new Token("foo"));
        assertTrue(ex.getMessage().contains("Unknown token"));
    }

    /* ---------- Interpreter tests ---------- */
    @Test
    @DisplayName("Interpreter: simple comparison true")
    void interpreter_simpleComparison() {
        Interpreter ip = new Interpreter();
        assertTrue(ip.interpret("7 3 >"));
    }

    @Test
    @DisplayName("Interpreter: simple logical")
    void interpreter_simpleLogical() {
        Interpreter ip = new Interpreter();
        assertFalse(ip.interpret("true false AND"));
        assertTrue(ip.interpret("true false OR"));
    }

    @Test
    @DisplayName("Interpreter: complex postfix")
    void interpreter_complex() {
        Interpreter ip = new Interpreter();
        // (8.3 > 5) AND false  →  false
        assertFalse(ip.interpret("8.3 5 > false AND"));
    }

    @Test
    @DisplayName("Interpreter: malformed – not enough operands")
    void interpreter_malformed_notEnoughOperands() {
        Interpreter ip = new Interpreter();
        Exception ex = assertThrows(IllegalArgumentException.class,
                                    () -> ip.interpret("7 >"));
        assertTrue(ex.getMessage().contains("Malformed postfix"));
    }

    @Test
    @DisplayName("Interpreter: malformed – wrong type on stack")
    void interpreter_malformed_wrongType() {
        Interpreter ip = new Interpreter();
        Exception ex = assertThrows(IllegalArgumentException.class,
                                    () -> ip.interpret("3 4 5 AND"));
        assertTrue(ex.getMessage().contains("Malformed postfix"));
    }

    @Test
    @DisplayName("Interpreter: empty input")
    void interpreter_emptyInput() {
        Interpreter ip = new Interpreter();
        Exception ex = assertThrows(IllegalArgumentException.class,
                                    () -> ip.interpret(""));
        assertTrue(ex.getMessage().contains("Empty input"));
    }
}