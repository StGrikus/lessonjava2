public enum Animal {
    DOG("Собака"), CAT("Кот"), MOUSE("Мышь");
    // new DOG("собака")

    private String translation;

    Animal(String translation){
        this.translation = translation;
    }

    public String getTranslation() {
        return translation;
    }

    public String toString() {
        return "Перевод на русский язык " + translation;
    }
}
