package org.example.demo.ticket.business;

import org.example.demo.ticket.business.manager.ProjetManager;
import org.example.demo.ticket.business.manager.TicketManager;

public final class ManagerFactory {
    /** Instance unique de la classe (design pattern Singleton) */
    private static final ManagerFactory INSTANCE = new ManagerFactory();

    /**
     * Constructeur.
     */
    public ManagerFactory() {
        super();
    }

    /**
     * Renvoie l'instance unique de la classe (design pattern Singleton).
     *
     * @return {@link ManagerFactory}
     */
    public static ManagerFactory getInstance() {
        return ManagerFactory.INSTANCE;
    }


    private ProjetManager projetManager;

    public ProjetManager getProjetManager() {
        return this.projetManager;
    }

    public void setProjetManager(ProjetManager projetManager) {
        this.projetManager = projetManager;
    }


    private TicketManager ticketManager;

    public void setTicketManager(TicketManager ticketManager) {
        this.ticketManager = ticketManager;
    }

    public TicketManager getTicketManager() {
        return this.ticketManager;
    }
}