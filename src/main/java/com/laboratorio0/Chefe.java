package com.laboratorio0;

public class Chefe {
    private final Usuario perfil; // Composição

    public Chefe(Usuario perfil) {
        this.perfil = perfil;
    }

    public void direcionarTarefa(Tarefa t, Usuario u) {
        System.out.println("Chefe " + perfil.getNomeUsuario() + " direcionou '" + t.getDescricao() + "' para " + u.getNomeUsuario());
    }

    // Delegação para acessar dados do Usuário
    public String getNome() { return perfil.getNomeUsuario(); }
    public String getEmail() { return perfil.getEmail(); }
}
