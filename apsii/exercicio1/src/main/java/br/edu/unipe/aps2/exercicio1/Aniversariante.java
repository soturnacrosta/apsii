package br.edu.unipe.aps2.exercicio1;

import java.util.Objects;

// Aniversariante não deve estender DataAniversario, pois um Aniversariante
// 'tem' uma DataAniversario (relação de composição).
public class Aniversariante {
	
	private String nome;
	private DataAniversario dataAniversario;
	
        public Aniversariante(String nome, DataAniversario dataAniversario) {
            this.nome = nome;
            this.dataAniversario = dataAniversario;
        }

        public Aniversariante(String nome, int dia, int mes) {
            this.nome = nome;
            this.dataAniversario = new DataAniversario(dia, mes); //ja recebe a instância
                //encapsulada
        }

        // gets e sets...
        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public DataAniversario getDataAniversario() {
            return dataAniversario;
        }

        public void setDataAniversario(DataAniversario dataAniversario) {
            this.dataAniversario = dataAniversario;
        }

        // Método equals para comparação de objetos
        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                    System.out.println("True!");
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                System.out.println("False!");

                return false;
            }
            final Aniversariante other = (Aniversariante) obj;
                System.out.println("False!");
            return Objects.equals(this.nome, other.nome) && Objects.equals(this.dataAniversario, other.dataAniversario);
        }

        @Override
        public String toString() {
            return "{" + "nome=" + nome + ", dataAniversario=" + dataAniversario + '}';
        }
        
}