/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import model.Utilisateur;

/**
 *
 * @author Lionel
 */
public interface UtilisateurService {
    
    public boolean ajouterUtilisateur(Utilisateur u);
    public boolean modifierUtilisateur(Utilisateur u);
    public boolean supprimerUtilisateur(Utilisateur u);
    public List<Utilisateur> listerUtilisateur();
    public Utilisateur connecter(String login, String pwd);
    
}
