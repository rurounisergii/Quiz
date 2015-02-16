package server;

import java.rmi.Remote;
import java.rmi.RemoteException;
import quiz.*;

public interface QuizRemoteInterface extends Remote {
	public boolean addQuiz(Quiz quizToAdd, int id) throws RemoteException;
	public boolean deleteQuiz(int id) throws RemoteException;
	public Quiz getQuiz(int id) throws RemoteException;
	public boolean addPlayerAttempt(PlayerAttempt playerAttemptToAdd) throws RemoteException;
}