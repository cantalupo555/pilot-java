package app.app009.entities;

import java.util.Date;

public class HourContract {
    private Date date;
    private double valeuPerHour;
    private Integer hours;

    public HourContract(Date date, double valeuPerHour, Integer hours) {
        this.date = date;
        this.valeuPerHour = valeuPerHour;
        this.hours = hours;
    }

    // Inicio Getter e Setter
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getValeuPerHour() {
        return valeuPerHour;
    }

    public void setValeuPerHour(double valeuPerHour) {
        this.valeuPerHour = valeuPerHour;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }
    // Fim Getter e Setter

    // Calcular o valor do contrato
    public double totalValue() {
        return valeuPerHour * hours;
    }
}
