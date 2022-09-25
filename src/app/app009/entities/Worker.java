package app.app009.entities;

import app.app009.entities.enums.WokerLevel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {
    private String name;
    private double baseSalary;
    private WokerLevel level;

    private Department departament;

    // Lista para armazenar os dados dos contratos
    List<HourContract> contracts = new ArrayList<>();

    public Worker(String name, double baseSalary, WokerLevel level, Department departament) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.level = level;
        this.departament = departament;
    }

    // Inicio Getter e Setter
    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public WokerLevel getLevel() {
        return level;
    }

    public void setLevel(WokerLevel level) {
        this.level = level;
    }

    public Department getDepartament() {
        return departament;
    }

    public void setDepartament(Department departament) {
        this.departament = departament;
    }
    // Fim Getter e Setter

    // Manipular lista dos contrados
    public void addContract(HourContract contract) {
        contracts.add(contract);
    }

    public void removeContract(HourContract contract) {
        contracts.remove(contract);
    }

    //  Determinar o mês e ano
    public double income(int month, int year) {
        double sum = baseSalary;
        Calendar cal = Calendar.getInstance();
        for (HourContract c : contracts) {
            cal.setTime(c.getDate());
            int c_month = 1 + cal.get(Calendar.MONTH);
            int c_year = cal.get(Calendar.YEAR);
            if (month == c_month && year == c_year) {
                sum += c.totalValue();
            }
        }
        return sum;
    }
}
