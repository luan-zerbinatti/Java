package gui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import classes.Alunos;
import classes.Aulas;
import classes.Curso;
import classes.Professor;
import classes.Salas;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class TelaAulas extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtTituloDoCurso;
	private JTextField txtArea;
	private JTextField txtCargaHoraria;
	private JTextField txtPrecoDoCurso;
	private JTextField txtIdentificacao;
	private JTextField txtDescricao;
	private JTextField txtNomeDoProfessor;
	private JTextField txtEmailDoProfessor;
	private JTextField txtCPFDoProfessor;
	private JTextField txtNomeDoAluno;
	private JTextField txtEmailDoAluno;
	private JTextField txtCPFDoAluno;
	private JTextField txtIdade;
	private JTextField txtIdDaAula;
	private JTextField txtCurso;
	private JTextField txtProfessor;
	private JTextField txtInicio;
	private JTextField txtTermino;
	private JTextField txtSala;
	
	/*
	 * Cria objetos , vai ficar em memoria
	 * Declaração dos itens para criar uma aula.
	 */
	private Curso curso;
	private Alunos alunos;
	private Salas salas;
	private Professor professor;
	private Aulas aulas;
	private List<Alunos> listaAluno;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaAulas frame = new TelaAulas();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaAulas() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\luan.zsfonseca\\Downloads\\Etherbrian-System-Error-Fatal.32.png"));
		
		//Vamos instanciar as nossas classes para gerar
		//objetos dos itens relacionados a aula.
		//Estes objetos estao vazio e serao preenchidos quando o 
		//usuario clicar nos botões de incluir
		curso = new Curso();
		listaAluno = new ArrayList<Alunos>();
		salas = new Salas();
		professor = new Professor();
		aulas = new Aulas();
		
		
		setResizable(false);
		setTitle("Cadastro de Aulas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 841, 620);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_curso = new JPanel();
		panel_curso.setBackground(Color.WHITE);
		panel_curso.setBounds(10, 11, 805, 90);
		contentPane.add(panel_curso);
		panel_curso.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Titulo do Curso:");
		lblNewLabel.setBackground(SystemColor.activeCaption);
		lblNewLabel.setForeground(Color.DARK_GRAY);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(10, 11, 149, 14);
		panel_curso.add(lblNewLabel);
		
		txtTituloDoCurso = new JTextField();
		txtTituloDoCurso.setBounds(140, 9, 322, 20);
		panel_curso.add(txtTituloDoCurso);
		txtTituloDoCurso.setColumns(10);
		
		JLabel lblrea = new JLabel("Área:");
		lblrea.setForeground(Color.DARK_GRAY);
		lblrea.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblrea.setBackground(SystemColor.activeCaption);
		lblrea.setBounds(472, 12, 66, 14);
		panel_curso.add(lblrea);
		
		txtArea = new JTextField();
		txtArea.setBounds(548, 9, 247, 20);
		panel_curso.add(txtArea);
		txtArea.setColumns(10);
		
		JLabel lblCargaHorria = new JLabel("Carga Horária:");
		lblCargaHorria.setForeground(Color.DARK_GRAY);
		lblCargaHorria.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCargaHorria.setBackground(SystemColor.activeCaption);
		lblCargaHorria.setBounds(10, 44, 149, 14);
		panel_curso.add(lblCargaHorria);
		
		txtCargaHoraria = new JTextField();
		txtCargaHoraria.setBounds(140, 42, 208, 20);
		panel_curso.add(txtCargaHoraria);
		txtCargaHoraria.setColumns(10);
		
		JLabel lblPrecoDoCurso = new JLabel("Preço do Curso");
		lblPrecoDoCurso.setForeground(Color.DARK_GRAY);
		lblPrecoDoCurso.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPrecoDoCurso.setBackground(SystemColor.activeCaption);
		lblPrecoDoCurso.setBounds(371, 44, 149, 14);
		panel_curso.add(lblPrecoDoCurso);
		
		txtPrecoDoCurso = new JTextField();
		txtPrecoDoCurso.setColumns(10);
		txtPrecoDoCurso.setBounds(472, 42, 323, 20);
		panel_curso.add(txtPrecoDoCurso);
		
		JPanel panel_sala = new JPanel();
		panel_sala.setBackground(new Color(255, 255, 255));
		panel_sala.setBounds(10, 107, 805, 64);
		contentPane.add(panel_sala);
		panel_sala.setLayout(null);
		
		JLabel txtIdentificao = new JLabel("Identificação:");
		txtIdentificao.setForeground(Color.DARK_GRAY);
		txtIdentificao.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtIdentificao.setBackground(SystemColor.activeCaption);
		txtIdentificao.setBounds(10, 23, 155, 14);
		panel_sala.add(txtIdentificao);
		
		txtIdentificacao = new JTextField();
		txtIdentificacao.setBounds(120, 21, 124, 20);
		panel_sala.add(txtIdentificacao);
		txtIdentificacao.setColumns(10);
		
		txtDescricao = new JTextField();
		txtDescricao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		txtDescricao.setColumns(10);
		txtDescricao.setBounds(328, 23, 467, 20);
		panel_sala.add(txtDescricao);
		
		JLabel lblDescrio = new JLabel("Descrição");
		lblDescrio.setForeground(Color.DARK_GRAY);
		lblDescrio.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDescrio.setBackground(SystemColor.activeCaption);
		lblDescrio.setBounds(254, 23, 149, 14);
		panel_sala.add(lblDescrio);
		
		JPanel panel_professor = new JPanel();
		panel_professor.setBackground(new Color(255, 255, 255));
		panel_professor.setBounds(10, 179, 805, 76);
		contentPane.add(panel_professor);
		panel_professor.setLayout(null);
		
		JLabel lblNomeDoProfessor = new JLabel("Nome do Professor");
		lblNomeDoProfessor.setForeground(Color.DARK_GRAY);
		lblNomeDoProfessor.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNomeDoProfessor.setBackground(SystemColor.activeCaption);
		lblNomeDoProfessor.setBounds(10, 13, 149, 14);
		panel_professor.add(lblNomeDoProfessor);
		
		txtNomeDoProfessor = new JTextField();
		txtNomeDoProfessor.setColumns(10);
		txtNomeDoProfessor.setBounds(10, 32, 260, 20);
		panel_professor.add(txtNomeDoProfessor);
		
		txtEmailDoProfessor = new JTextField();
		txtEmailDoProfessor.setColumns(10);
		txtEmailDoProfessor.setBounds(280, 32, 260, 20);
		panel_professor.add(txtEmailDoProfessor);
		
		JLabel lblEmailDoProfessor = new JLabel("E-Mail do Professor:");
		lblEmailDoProfessor.setForeground(Color.DARK_GRAY);
		lblEmailDoProfessor.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEmailDoProfessor.setBackground(SystemColor.activeCaption);
		lblEmailDoProfessor.setBounds(280, 13, 149, 14);
		panel_professor.add(lblEmailDoProfessor);
		
		txtCPFDoProfessor = new JTextField();
		txtCPFDoProfessor.setColumns(10);
		txtCPFDoProfessor.setBounds(550, 32, 245, 20);
		panel_professor.add(txtCPFDoProfessor);
		
		JLabel lblNomeDoProfessor_1_1 = new JLabel("CPF do Professor");
		lblNomeDoProfessor_1_1.setForeground(Color.DARK_GRAY);
		lblNomeDoProfessor_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNomeDoProfessor_1_1.setBackground(SystemColor.activeCaption);
		lblNomeDoProfessor_1_1.setBounds(550, 13, 203, 14);
		panel_professor.add(lblNomeDoProfessor_1_1);
		
		JPanel panel_aluno = new JPanel();
		panel_aluno.setBackground(new Color(255, 255, 255));
		panel_aluno.setBounds(10, 266, 805, 116);
		contentPane.add(panel_aluno);
		panel_aluno.setLayout(null);
		
		JLabel lblNomeDoAluno = new JLabel("Nome do Aluno:");
		lblNomeDoAluno.setForeground(Color.DARK_GRAY);
		lblNomeDoAluno.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNomeDoAluno.setBackground(SystemColor.activeCaption);
		lblNomeDoAluno.setBounds(10, 11, 149, 14);
		panel_aluno.add(lblNomeDoAluno);
		
		txtNomeDoAluno = new JTextField();
		txtNomeDoAluno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		txtNomeDoAluno.setColumns(10);
		txtNomeDoAluno.setBounds(10, 30, 396, 20);
		panel_aluno.add(txtNomeDoAluno);
		
		JLabel lblEmailDoAluno = new JLabel("E-Mail do Aluno:");
		lblEmailDoAluno.setForeground(Color.DARK_GRAY);
		lblEmailDoAluno.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEmailDoAluno.setBackground(SystemColor.activeCaption);
		lblEmailDoAluno.setBounds(427, 11, 149, 14);
		panel_aluno.add(lblEmailDoAluno);
		
		txtEmailDoAluno = new JTextField();
		txtEmailDoAluno.setColumns(10);
		txtEmailDoAluno.setBounds(427, 30, 368, 20);
		panel_aluno.add(txtEmailDoAluno);
		
		JLabel txtCpfDoAluno = new JLabel("CPF do Aluno:");
		txtCpfDoAluno.setForeground(Color.DARK_GRAY);
		txtCpfDoAluno.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtCpfDoAluno.setBackground(SystemColor.activeCaption);
		txtCpfDoAluno.setBounds(10, 65, 149, 14);
		panel_aluno.add(txtCpfDoAluno);
		
		txtCPFDoAluno = new JTextField();
		txtCPFDoAluno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		txtCPFDoAluno.setColumns(10);
		txtCPFDoAluno.setBounds(140, 63, 322, 20);
		panel_aluno.add(txtCPFDoAluno);
		
		JLabel lblIdade = new JLabel("Idade:");
		lblIdade.setForeground(Color.DARK_GRAY);
		lblIdade.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblIdade.setBackground(SystemColor.activeCaption);
		lblIdade.setBounds(472, 66, 66, 14);
		panel_aluno.add(lblIdade);
		
		txtIdade = new JTextField();
		txtIdade.setColumns(10);
		txtIdade.setBounds(548, 63, 247, 20);
		panel_aluno.add(txtIdade);
		
		JPanel panel_aulas = new JPanel();
		panel_aulas.setBackground(new Color(255, 255, 255));
		panel_aulas.setBounds(10, 393, 805, 106);
		contentPane.add(panel_aulas);
		panel_aulas.setLayout(null);
		
		JLabel txtIdAula = new JLabel("Id da Aula:");
		txtIdAula.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtIdAula.setBounds(10, 11, 169, 14);
		panel_aulas.add(txtIdAula);
		
		txtIdDaAula = new JTextField();
		txtIdDaAula.setBounds(96, 9, 120, 20);
		panel_aulas.add(txtIdDaAula);
		txtIdDaAula.setColumns(10);
		
		JLabel txtCurs = new JLabel("Curso:");
		txtCurs.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtCurs.setBounds(238, 12, 87, 14);
		panel_aulas.add(txtCurs);
		
		txtCurso = new JTextField();
		txtCurso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		txtCurso.setColumns(10);
		txtCurso.setBounds(292, 9, 206, 20);
		panel_aulas.add(txtCurso);
		
		JLabel txtProfess = new JLabel("Professor:");
		txtProfess.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtProfess.setBounds(509, 14, 87, 14);
		panel_aulas.add(txtProfess);
		
		txtProfessor = new JTextField();
		txtProfessor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		txtProfessor.setColumns(10);
		txtProfessor.setBounds(589, 11, 206, 20);
		panel_aulas.add(txtProfessor);
		
		JLabel txtInicii = new JLabel("Início:");
		txtInicii.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtInicii.setBounds(10, 48, 169, 14);
		panel_aulas.add(txtInicii);
		
		txtInicio = new JTextField();
		txtInicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		txtInicio.setColumns(10);
		txtInicio.setBounds(96, 46, 120, 20);
		panel_aulas.add(txtInicio);
		
		JLabel txtTermin = new JLabel("Término:");
		txtTermin.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtTermin.setBounds(238, 48, 169, 14);
		panel_aulas.add(txtTermin);
		
		txtTermino = new JTextField();
		txtTermino.setColumns(10);
		txtTermino.setBounds(302, 46, 120, 20);
		panel_aulas.add(txtTermino);
		
		JLabel txtAlunos = new JLabel("Alunos:");
		txtAlunos.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtAlunos.setBounds(440, 49, 169, 14);
		panel_aulas.add(txtAlunos);
		
		JComboBox cboalunos = new JComboBox();
		cboalunos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		cboalunos.setBounds(533, 48, 262, 17);
		panel_aulas.add(cboalunos);
		
		JLabel txtSal = new JLabel("Sala");
		txtSal.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtSal.setBounds(10, 81, 46, 14);
		panel_aulas.add(txtSal);
		
		txtSala = new JTextField();
		txtSala.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		txtSala.setBounds(93, 78, 123, 20);
		panel_aulas.add(txtSala);
		txtSala.setColumns(10);
		
		JButton btnIncluirCurso = new JButton("Incluir curso");
		btnIncluirCurso.setIcon(new ImageIcon("C:\\Users\\luan.zsfonseca\\Downloads\\Benno-Meyer-Benno-System-Book-Grey.32.png"));
		btnIncluirCurso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				//obter o texto que esta na caixa de titulo do curso e
				//adcionar a caixa curso que esta na area do Criar Aula
				txtCurso.setText(txtTituloDoCurso.getText());
				
				//Vamos adcionar os elementos do curso ao objeto curso, tais como:
				//titulo, carga horaria, datainicio ...
				curso.setTitulo(txtTituloDoCurso.getText());
				curso.setArea(txtArea.getText());
				curso.setCargaHoraria(txtCargaHoraria.getText());
				curso.setPreco(Double.parseDouble(txtPrecoDoCurso.getText()));
				
				//Vamos desativar o painel de cursos. Vamos usar
				// o comando enable com o valor false 
				txtTituloDoCurso.setEnabled(false);
				txtArea.setEnabled(false);
				txtCargaHoraria.setEnabled(false);
				txtPrecoDoCurso.setEnabled(false);
				btnIncluirCurso.setEnabled(false);
			}
		});
		btnIncluirCurso.setBounds(10, 510, 141, 60);
		contentPane.add(btnIncluirCurso);
		
		JButton btnIncluirSala = new JButton("Incluir sala");
		btnIncluirSala.setIcon(new ImageIcon("C:\\Users\\luan.zsfonseca\\Downloads\\Benno-Meyer-Benno-System-Book-Grey.32.png"));
		btnIncluirSala.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Preencher os dados do objeto sala
				salas.setIdentificacao(txtIdentificacao.getText());
				salas.setDescricao(txtDescricao.getText());
				
				txtSala.setText(txtIdentificacao.getText());
				
				btnIncluirSala.setEnabled(false);
				txtIdentificacao.setEnabled(false);
				txtDescricao.setEnabled(false);
			}
		});
		btnIncluirSala.setBounds(161, 510, 141, 60);
		contentPane.add(btnIncluirSala);
		
		JButton btnIncluirProfessor = new JButton("Incluir professor");
		btnIncluirProfessor.setIcon(new ImageIcon("C:\\Users\\luan.zsfonseca\\Downloads\\Benno-Meyer-Benno-System-Book-Grey.32.png"));
		btnIncluirProfessor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				professor.setNome(txtNomeDoProfessor.getText());
				professor.setEmail(txtEmailDoProfessor.getText());
				professor.setCpf(txtCPFDoProfessor.getText());
				
				txtProfessor.setText(txtNomeDoProfessor.getText());
				
				btnIncluirProfessor.setEnabled(false);
				txtCurso.setText(txtNomeDoProfessor.getText());
				txtNomeDoProfessor.setEnabled(false);
				txtEmailDoProfessor.setEnabled(false);
				txtCPFDoProfessor.setEnabled(false);
			}
		});
		btnIncluirProfessor.setBounds(312, 510, 141, 60);
		contentPane.add(btnIncluirProfessor);
		
		JButton btnIncluirAluno = new JButton("Incluir aluno");
		btnIncluirAluno.setIcon(new ImageIcon("C:\\Users\\luan.zsfonseca\\Downloads\\Benno-Meyer-Benno-System-Book-Grey.32.png"));
		btnIncluirAluno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				alunos = new Alunos();
				
				alunos.setNome(txtNomeDoAluno.getText());
				alunos.setEmail(txtEmailDoAluno.getText());
				alunos.setCpf(txtCPFDoAluno.getText());
				alunos.setIdade(Integer.parseInt(txtIdade.getText()));
				listaAluno.add(alunos);
				
				
				cboalunos.addItem(txtNomeDoAluno.getText());
				
				btnIncluirAluno.setEnabled(false);
				txtCurso.setText(txtNomeDoAluno.getText());
				txtNomeDoAluno.setEnabled(false);
				txtEmailDoAluno.setEnabled(false);
				txtIdade.setEnabled(false);
				txtCPFDoAluno.setEnabled(false);
				
				listaAluno.add(alunos);
			}
		});
		btnIncluirAluno.setBounds(463, 510, 141, 60);
		contentPane.add(btnIncluirAluno);
		
		JButton btnCriarAAula = new JButton("Criar a Aula");
		btnCriarAAula.setIcon(new ImageIcon("C:\\Users\\luan.zsfonseca\\Downloads\\Benno-Meyer-Benno-System-Book-Grey.32.png"));
		btnCriarAAula.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				aulas.setId(Integer.parseInt(txtIdDaAula.getText()));
				aulas.setCurso(curso);
				aulas.setProfessor(professor);
				
				aulas.setInicio(new Date(Long.parseLong(txtInicio.getText())));
				aulas.setTermino(new Date(Long.parseLong(txtTermino.getText())));
				
				aulas.setAlunos(listaAluno.toArray(new Alunos[0]));
				aulas.setSala(salas);
				
				
				btnCriarAAula.setEnabled(false);
				txtSala.setEnabled(false);
				txtInicio.setEnabled(false);
				txtTermino.setEnabled(false);
				txtProfessor.setEnabled(false);
				txtIdDaAula.setEnabled(false);
				txtCurso.setEnabled(false);
				cboalunos.setEnabled(false);
				
				System.out.print(cboalunos.getItemAt(0));
			}
		});
		btnCriarAAula.setBounds(625, 510, 141, 60);
		contentPane.add(btnCriarAAula);
	}
}
