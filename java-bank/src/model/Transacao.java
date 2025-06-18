package model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record Transacao(String tipo, BigDecimal valor, LocalDateTime dataHora) {
    public Transacao(String tipo, BigDecimal valor) {
        this(tipo, valor, LocalDateTime.now());
    }
}
