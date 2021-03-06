/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Manhique
 */
@Entity
@Table(name = "estudante", catalog = "bh", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Estudante.findAll", query = "SELECT e FROM Estudante e")
    , @NamedQuery(name = "Estudante.findByIdEstudante", query = "SELECT e FROM Estudante e WHERE e.idEstudante = :idEstudante")
    , @NamedQuery(name = "Estudante.findByNrEstudante", query = "SELECT e FROM Estudante e WHERE e.nrEstudante = :nrEstudante")
    , @NamedQuery(name = "Estudante.findByNomeCompleto", query = "SELECT e FROM Estudante e WHERE e.nomeCompleto = :nomeCompleto")
    , @NamedQuery(name = "Estudante.findByApelido", query = "SELECT e FROM Estudante e WHERE e.apelido = :apelido")
    , @NamedQuery(name = "Estudante.findByDataNascimento", query = "SELECT e FROM Estudante e WHERE e.dataNascimento = :dataNascimento")
    , @NamedQuery(name = "Estudante.findByNomePai", query = "SELECT e FROM Estudante e WHERE e.nomePai = :nomePai")
    , @NamedQuery(name = "Estudante.findByNomeMae", query = "SELECT e FROM Estudante e WHERE e.nomeMae = :nomeMae")
    , @NamedQuery(name = "Estudante.findByNaturalidade", query = "SELECT e FROM Estudante e WHERE e.naturalidade = :naturalidade")
    , @NamedQuery(name = "Estudante.findByLocalidade", query = "SELECT e FROM Estudante e WHERE e.localidade = :localidade")
    , @NamedQuery(name = "Estudante.findByDistrito", query = "SELECT e FROM Estudante e WHERE e.distrito = :distrito")
    , @NamedQuery(name = "Estudante.findByAnoTerMedio", query = "SELECT e FROM Estudante e WHERE e.anoTerMedio = :anoTerMedio")
    , @NamedQuery(name = "Estudante.findByEscola", query = "SELECT e FROM Estudante e WHERE e.escola = :escola")
    , @NamedQuery(name = "Estudante.findByAnoIngresso", query = "SELECT e FROM Estudante e WHERE e.anoIngresso = :anoIngresso")
    , @NamedQuery(name = "Estudante.findByNivelFrequencia", query = "SELECT e FROM Estudante e WHERE e.nivelFrequencia = :nivelFrequencia")
    , @NamedQuery(name = "Estudante.findByPastaDocumento", query = "SELECT e FROM Estudante e WHERE e.pastaDocumento = :pastaDocumento")
    , @NamedQuery(name = "Estudante.findByNomeEncarregado", query = "SELECT e FROM Estudante e WHERE e.nomeEncarregado = :nomeEncarregado")
    , @NamedQuery(name = "Estudante.findByContactoEncarregado", query = "SELECT e FROM Estudante e WHERE e.contactoEncarregado = :contactoEncarregado")
    , @NamedQuery(name = "Estudante.findByGrauParentesco", query = "SELECT e FROM Estudante e WHERE e.grauParentesco = :grauParentesco")
    , @NamedQuery(name = "Estudante.findByTamAgregadoFamiliar", query = "SELECT e FROM Estudante e WHERE e.tamAgregadoFamiliar = :tamAgregadoFamiliar")
    , @NamedQuery(name = "Estudante.findByPrimeiraUniversidade", query = "SELECT e FROM Estudante e WHERE e.primeiraUniversidade = :primeiraUniversidade")
    , @NamedQuery(name = "Estudante.findByIdioma", query = "SELECT e FROM Estudante e WHERE e.idioma = :idioma")
    , @NamedQuery(name = "Estudante.findByEmail", query = "SELECT e FROM Estudante e WHERE e.email = :email")
    , @NamedQuery(name = "Estudante.findByNotaAdmissao", query = "SELECT e FROM Estudante e WHERE e.notaAdmissao = :notaAdmissao")
    , @NamedQuery(name = "Estudante.findByOutraViaIngresso", query = "SELECT e FROM Estudante e WHERE e.outraViaIngresso = :outraViaIngresso")
    , @NamedQuery(name = "Estudante.findByIstrabalhador", query = "SELECT e FROM Estudante e WHERE e.istrabalhador = :istrabalhador")
    , @NamedQuery(name = "Estudante.findByIsTransferencia", query = "SELECT e FROM Estudante e WHERE e.isTransferencia = :isTransferencia")
    , @NamedQuery(name = "Estudante.findByIsMudancaUn", query = "SELECT e FROM Estudante e WHERE e.isMudancaUn = :isMudancaUn")
    , @NamedQuery(name = "Estudante.findByIsBolseiro", query = "SELECT e FROM Estudante e WHERE e.isBolseiro = :isBolseiro")
    , @NamedQuery(name = "Estudante.findByMasculino", query = "SELECT e FROM Estudante e WHERE e.masculino = :masculino")
    , @NamedQuery(name = "Estudante.findByEstado", query = "SELECT e FROM Estudante e WHERE e.estado = :estado")
    , @NamedQuery(name = "Estudante.findByTestudo", query = "SELECT e FROM Estudante e WHERE e.testudo = :testudo")
    , @NamedQuery(name = "Estudante.findByUltimamatricula", query = "SELECT e FROM Estudante e WHERE e.ultimamatricula = :ultimamatricula")
    , @NamedQuery(name = "Estudante.findByMudancac", query = "SELECT e FROM Estudante e WHERE e.mudancac = :mudancac")
    , @NamedQuery(name = "Estudante.findByTransferido", query = "SELECT e FROM Estudante e WHERE e.transferido = :transferido")})
public class Estudante implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_estudante", nullable = false)
    private Long idEstudante;
    @Size(max = 45)
    @Column(name = "nr_estudante", length = 45)
    private String nrEstudante;
    @Size(max = 45)
    @Column(name = "nome_completo", length = 45)
    private String nomeCompleto;
    @Size(max = 45)
    @Column(name = "apelido", length = 45)
    private String apelido;
    @Column(name = "data_nascimento")
    @Temporal(TemporalType.DATE)
    private Date dataNascimento;
    @Size(max = 45)
    @Column(name = "nome_pai", length = 45)
    private String nomePai;
    @Size(max = 45)
    @Column(name = "nome_mae", length = 45)
    private String nomeMae;
    @Size(max = 45)
    @Column(name = "naturalidade", length = 45)
    private String naturalidade;
    @Size(max = 45)
    @Column(name = "localidade", length = 45)
    private String localidade;
    @Size(max = 45)
    @Column(name = "distrito", length = 45)
    private String distrito;
    @Column(name = "ano_ter_medio")
    private Integer anoTerMedio;
    @Size(max = 45)
    @Column(name = "escola", length = 45)
    private String escola;
    @Column(name = "ano_ingresso")
    private Integer anoIngresso;
    @Column(name = "nivel_frequencia")
    private Integer nivelFrequencia;
    @Size(max = 255)
    @Column(name = "pasta_documento", length = 255)
    private String pastaDocumento;
    @Size(max = 45)
    @Column(name = "nome_encarregado", length = 45)
    private String nomeEncarregado;
    @Size(max = 45)
    @Column(name = "contacto_encarregado", length = 45)
    private String contactoEncarregado;
    @Size(max = 45)
    @Column(name = "grau_parentesco", length = 45)
    private String grauParentesco;
    @Column(name = "tam_agregado_familiar")
    private Integer tamAgregadoFamiliar;
    @Size(max = 45)
    @Column(name = "primeira_universidade", length = 45)
    private String primeiraUniversidade;
    @Size(max = 45)
    @Column(name = "idioma", length = 45)
    private String idioma;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 45)
    @Column(name = "email", length = 45)
    private String email;
    @Column(name = "nota_admissao")
    private Integer notaAdmissao;
    @Size(max = 45)
    @Column(name = "outra_via_ingresso", length = 45)
    private String outraViaIngresso;
    @Column(name = "istrabalhador")
    private Boolean istrabalhador;
    @Column(name = "is_transferencia")
    private Boolean isTransferencia;
    @Column(name = "is_mudanca_un")
    private Boolean isMudancaUn;
    @Column(name = "is_bolseiro")
    private Boolean isBolseiro;
    @Column(name = "masculino")
    private Boolean masculino;
    @Column(name = "estado")
    private Boolean estado;
    @Column(name = "testudo")
    private Integer testudo;
    @Column(name = "ultimamatricula")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ultimamatricula;
    @Column(name = "mudancac")
    private Short mudancac;
    @Column(name = "transferido")
    private Short transferido;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "estudante", fetch = FetchType.LAZY)
    private Profissao profissao;
    @OneToMany(mappedBy = "idEstudante", fetch = FetchType.LAZY)
    private List<Users> usersList;
    @JoinColumn(name = "bolsa", referencedColumnName = "id_bolsa")
    @ManyToOne(fetch = FetchType.LAZY)
    private Bolsa bolsa;
    @JoinColumn(name = "cursocurrente", referencedColumnName = "id_curso", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Curso cursocurrente;
    @JoinColumn(name = "cursoingresso", referencedColumnName = "id_curso", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Curso cursoingresso;
    @JoinColumn(name = "estado_civil", referencedColumnName = "id_estado")
    @ManyToOne(fetch = FetchType.LAZY)
    private Estadocivil estadoCivil;
    @JoinColumn(name = "escola_pais", referencedColumnName = "id_pais")
    @ManyToOne(fetch = FetchType.LAZY)
    private Pais escolaPais;
    @JoinColumn(name = "nacionalidade", referencedColumnName = "id_pais", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Pais nacionalidade;
    @JoinColumn(name = "via_ingresso", referencedColumnName = "id_via_ingresso")
    @ManyToOne(fetch = FetchType.LAZY)
    private Viaingresso viaIngresso;

    public Estudante() {
    }

    public Estudante(Long idEstudante) {
        this.idEstudante = idEstudante;
    }

    public Long getIdEstudante() {
        return idEstudante;
    }

    public void setIdEstudante(Long idEstudante) {
        this.idEstudante = idEstudante;
    }

    public String getNrEstudante() {
        return nrEstudante;
    }

    public void setNrEstudante(String nrEstudante) {
        this.nrEstudante = nrEstudante;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public String getNaturalidade() {
        return naturalidade;
    }

    public void setNaturalidade(String naturalidade) {
        this.naturalidade = naturalidade;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public Integer getAnoTerMedio() {
        return anoTerMedio;
    }

    public void setAnoTerMedio(Integer anoTerMedio) {
        this.anoTerMedio = anoTerMedio;
    }

    public String getEscola() {
        return escola;
    }

    public void setEscola(String escola) {
        this.escola = escola;
    }

    public Integer getAnoIngresso() {
        return anoIngresso;
    }

    public void setAnoIngresso(Integer anoIngresso) {
        this.anoIngresso = anoIngresso;
    }

    public Integer getNivelFrequencia() {
        return nivelFrequencia;
    }

    public void setNivelFrequencia(Integer nivelFrequencia) {
        this.nivelFrequencia = nivelFrequencia;
    }

    public String getPastaDocumento() {
        return pastaDocumento;
    }

    public void setPastaDocumento(String pastaDocumento) {
        this.pastaDocumento = pastaDocumento;
    }

    public String getNomeEncarregado() {
        return nomeEncarregado;
    }

    public void setNomeEncarregado(String nomeEncarregado) {
        this.nomeEncarregado = nomeEncarregado;
    }

    public String getContactoEncarregado() {
        return contactoEncarregado;
    }

    public void setContactoEncarregado(String contactoEncarregado) {
        this.contactoEncarregado = contactoEncarregado;
    }

    public String getGrauParentesco() {
        return grauParentesco;
    }

    public void setGrauParentesco(String grauParentesco) {
        this.grauParentesco = grauParentesco;
    }

    public Integer getTamAgregadoFamiliar() {
        return tamAgregadoFamiliar;
    }

    public void setTamAgregadoFamiliar(Integer tamAgregadoFamiliar) {
        this.tamAgregadoFamiliar = tamAgregadoFamiliar;
    }

    public String getPrimeiraUniversidade() {
        return primeiraUniversidade;
    }

    public void setPrimeiraUniversidade(String primeiraUniversidade) {
        this.primeiraUniversidade = primeiraUniversidade;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getNotaAdmissao() {
        return notaAdmissao;
    }

    public void setNotaAdmissao(Integer notaAdmissao) {
        this.notaAdmissao = notaAdmissao;
    }

    public String getOutraViaIngresso() {
        return outraViaIngresso;
    }

    public void setOutraViaIngresso(String outraViaIngresso) {
        this.outraViaIngresso = outraViaIngresso;
    }

    public Boolean getIstrabalhador() {
        return istrabalhador;
    }

    public void setIstrabalhador(Boolean istrabalhador) {
        this.istrabalhador = istrabalhador;
    }

    public Boolean getIsTransferencia() {
        return isTransferencia;
    }

    public void setIsTransferencia(Boolean isTransferencia) {
        this.isTransferencia = isTransferencia;
    }

    public Boolean getIsMudancaUn() {
        return isMudancaUn;
    }

    public void setIsMudancaUn(Boolean isMudancaUn) {
        this.isMudancaUn = isMudancaUn;
    }

    public Boolean getIsBolseiro() {
        return isBolseiro;
    }

    public void setIsBolseiro(Boolean isBolseiro) {
        this.isBolseiro = isBolseiro;
    }

    public Boolean getMasculino() {
        return masculino;
    }

    public void setMasculino(Boolean masculino) {
        this.masculino = masculino;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public Integer getTestudo() {
        return testudo;
    }

    public void setTestudo(Integer testudo) {
        this.testudo = testudo;
    }

    public Date getUltimamatricula() {
        return ultimamatricula;
    }

    public void setUltimamatricula(Date ultimamatricula) {
        this.ultimamatricula = ultimamatricula;
    }

    public Short getMudancac() {
        return mudancac;
    }

    public void setMudancac(Short mudancac) {
        this.mudancac = mudancac;
    }

    public Short getTransferido() {
        return transferido;
    }

    public void setTransferido(Short transferido) {
        this.transferido = transferido;
    }

    public Profissao getProfissao() {
        return profissao;
    }

    public void setProfissao(Profissao profissao) {
        this.profissao = profissao;
    }

    @XmlTransient
    public List<Users> getUsersList() {
        return usersList;
    }

    public void setUsersList(List<Users> usersList) {
        this.usersList = usersList;
    }

    public Bolsa getBolsa() {
        return bolsa;
    }

    public void setBolsa(Bolsa bolsa) {
        this.bolsa = bolsa;
    }

    public Curso getCursocurrente() {
        return cursocurrente;
    }

    public void setCursocurrente(Curso cursocurrente) {
        this.cursocurrente = cursocurrente;
    }

    public Curso getCursoingresso() {
        return cursoingresso;
    }

    public void setCursoingresso(Curso cursoingresso) {
        this.cursoingresso = cursoingresso;
    }

    public Estadocivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(Estadocivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public Pais getEscolaPais() {
        return escolaPais;
    }

    public void setEscolaPais(Pais escolaPais) {
        this.escolaPais = escolaPais;
    }

    public Pais getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(Pais nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public Viaingresso getViaIngresso() {
        return viaIngresso;
    }

    public void setViaIngresso(Viaingresso viaIngresso) {
        this.viaIngresso = viaIngresso;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEstudante != null ? idEstudante.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Estudante)) {
            return false;
        }
        Estudante other = (Estudante) object;
        if ((this.idEstudante == null && other.idEstudante != null) || (this.idEstudante != null && !this.idEstudante.equals(other.idEstudante))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Estudante[ idEstudante=" + idEstudante + " ]";
    }
    
}
