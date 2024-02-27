import java.time.LocalDate;

abstract class EducationCenter {
    private String name;
    private String LocatedCountry;
    private LocalDate FoundationYear;

    public EducationCenter(String name, String locatedCountry, LocalDate foundationYear) {
        this.name = name;
        LocatedCountry = locatedCountry;
        FoundationYear = foundationYear;
    }

    @Override
    public String toString() {
        return "EducationCenter{" +
                "name='" + name + '\'' +
                ", LocatedCountry='" + LocatedCountry + '\'' +
                ", FoundationYear=" + FoundationYear +
                '}';
    }
}
