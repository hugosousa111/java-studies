package pacote;
import robocode.*;
import java.awt.Color;
/**
 * Bumblebee - a robot by Hugo Sousa and Kamila Amelia
 * 
 * Robô tentara se manter sempre andando nas paredes do campo de batalha,
 * visto que robôs com essa característica apresentaram melhor desempenho 
 * e melhores colocações em batalhas com pequeno e grande número de adversários 
 * 
 * Fontes de consulta:
 * http://stummjr.github.io/robocode/
 * http://www.gsigma.ufsc.br/~popov/aulas/robocode/eventos.html
 * http://robowiki.net/wiki/Main_Page
 * 
 */
public class Bumblebee extends Robot
{
	/**
	 * run: Bumblebee's default behavior
	 */
	boolean ja_bateu = false;
	double angulo_alterado=0;
	public void run() {
		setBodyColor(Color.YELLOW);
		setGunColor(Color.YELLOW);
		setScanColor(Color.GREEN);
		setRadarColor(Color.YELLOW);
		setBulletColor(Color.BLACK);
		while(true) {
			//o carro anda o suficiente até achar uma parede
			ahead(1000);
		}
	}
	/**
	 * onScannedRobot: What to do when you see another robot
	 */
	public void onScannedRobot(ScannedRobotEvent e) {
		double dist = e.getDistance();
		if (dist>400){
			fire(1);
		}else{
			fire(3);							 
		}
	}
	/**
	 * onHitByBullet: What to do when you're hit by a bullet
	 */
	public void onHitByBullet(HitByBulletEvent e) {
		//	back(100);
		/*  devido a estratégia do nosso robô, como ele está sempre em movimento nas paredes,
		 	ter uma ação como back() quando levar um tiro, só atrapalha o nosso robo*/
	}
	/**
	 * onHitWall: What to do when you hit a wall
	 */
	public void onHitWall(HitWallEvent e) {
		//faço o carro girar 90 graus menos o valor absoluto da batida do robo contra a parede
		turnRight(90- Math.abs(e.getBearing())); 
		if ((getHeading() == 0 || getHeading() ==90 || getHeading() ==180 || getHeading() ==270) && ja_bateu== false){
		   	//gira apenas a arma para dentro do campo de batalha
			turnGunRight(90);
			ja_bateu = true;
		}//esse if emgloba os casos:
		//se ele estiver na parede direita, andando para cima, e ainda não tiver batido em uma parede
		//se ele estiver na parede de cima, andando para direita, e ainda não tiver batido em uma parede
		//se ele estiver na parede esquerda, andando para baixo, e ainda não tiver batido em uma parede
		//se ele estiver na parede de baixo, andando para esquerda, e ainda não tiver batido em uma parede
	}
	public void onHitRobot(HitRobotEvent e){
		//quando ele tocar em outro robô, mudará algumas de suas caracteristicas de amerelo para vermelho
		back(10);	
		setGunColor(Color.RED);
		setScanColor(Color.RED);
		setBulletColor(Color.RED);
		//quando o carro estiver virado para cima, direita, baixo e esquerda respectivamente, entra nesse if
		if (getHeading() == 0 || getHeading() ==90 || getHeading() ==180 || getHeading() ==270){
			//	double b  = 360- e.getBearing();
			turnGunRight(e.getBearing()-90);	 //gira a arma o ângulo do robô adversário menos 90 graus, 
		//	turnGunLeft(e.getBearing()+90);
			fire(3);							 //atira com força máxima			
			turnGunRight(-e.getBearing()+90); 	 //volta a arma para o seu ângulo de origem
		//	turnGunLeft(-e.getBearing()-90);
			//	turnGunRight(90-e.getBearing());
		}else {
			double test =e.getBearing(); 
			turnGunRight(test);
			fire(3);	 //atira com força máxima			
			//	d=d+(-e.getBearing()+90);
			turnGunRight(-test);
		}	
			
	}	
}