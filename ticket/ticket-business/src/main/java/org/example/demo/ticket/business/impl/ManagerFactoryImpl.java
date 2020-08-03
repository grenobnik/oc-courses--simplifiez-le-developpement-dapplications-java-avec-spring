package org.example.demo.ticket.business.impl;

import org.example.demo.ticket.business.contract.ManagerFactory;
import org.example.demo.ticket.business.contract.manager.ProjetManager;
import org.example.demo.ticket.business.contract.manager.TicketManager;

public final class ManagerFactoryImpl implements ManagerFactory {

//    /** Instance unique de la classe (design pattern Singleton) */
//    private static final ManagerFactory INSTANCE = new ManagerFactoryImpl();

//    /**
//     * Constructeur.
//     */
//    public ManagerFactoryImpl() {
//        super();
//    }

//    /**
//     * Renvoie l'instance unique de la classe (design pattern Singleton).
//     *
//     * @return {@link ManagerFactory}
//     */
//    public static ManagerFactory getInstance() {
//        return ManagerFactoryImpl.INSTANCE;
//    }


    private ProjetManager projetManager;

    @Override
    public ProjetManager getProjetManager() {
        return this.projetManager;
    }

    @Override
    public void setProjetManager(ProjetManager projetManager) {
        this.projetManager = projetManager;
    }


    private TicketManager ticketManager;

    @Override
    public void setTicketManager(TicketManager ticketManager) {
        this.ticketManager = ticketManager;
    }

    @Override
    public TicketManager getTicketManager() {
        return this.ticketManager;
    }
}