package enums;

public enum Env {

    DEV("cat-fact"),
    UAT("uat");

    private final String env;

    // Construtor privado para inicializar o campo env
    private Env(String env) {
        this.env = env;
    }

    // Método para obter o valor do enum
    public String getEnv() {
        return env;
    }


}
