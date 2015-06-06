package com.magmafitness.util;

import com.magmafitness.model.address.AddressDAO;
import com.magmafitness.model.address.AddressDAOHibernate;
import com.magmafitness.model.contact.ContactDAO;
import com.magmafitness.model.contact.ContactDAOHibernate;
import com.magmafitness.model.email.EmailDAO;
import com.magmafitness.model.email.EmailDAOHibernate;
import com.magmafitness.model.phone.PhoneDAO;
import com.magmafitness.model.phone.PhoneDAOHibernate;
import com.magmafitness.model.stateCity.StateCityDAO;
import com.magmafitness.model.stateCity.StateCityDAOHibernate;
import com.magmafitness.model.users.UsersDAO;
import com.magmafitness.model.users.UsersDAOHibernate;

/**
 *
 * @author Dirceu Junior
 */
public class DAOFactory {

    public static UsersDAO createUserDAO() {
        UsersDAOHibernate usersDAO = new UsersDAOHibernate();
        usersDAO.setSession(HibernateUtil.getSessionFactory().getCurrentSession());
        return usersDAO;
    }

    public static ContactDAO createContactDAO() {
        ContactDAOHibernate contactDAO = new ContactDAOHibernate();
        contactDAO.setSession(HibernateUtil.getSessionFactory().getCurrentSession());
        return contactDAO;
    }

    public static PhoneDAO createPhoneDAO() {
        PhoneDAOHibernate phoneDAO = new PhoneDAOHibernate();
        phoneDAO.setSession(HibernateUtil.getSessionFactory().getCurrentSession());
        return phoneDAO;
    }

    public static AddressDAO createAddressDAO() {
        AddressDAOHibernate addressDAO = new AddressDAOHibernate();
        addressDAO.setSession(HibernateUtil.getSessionFactory().getCurrentSession());
        return addressDAO;
    }

    public static StateCityDAO createStateCityDAO() {
        StateCityDAOHibernate stateCityDAO = new StateCityDAOHibernate();
        stateCityDAO.setSession(HibernateUtil.getSessionFactory().getCurrentSession());
        return stateCityDAO;
    }

    public static EmailDAO createEmailDAO() {
        EmailDAOHibernate emailDAO = new EmailDAOHibernate();
        emailDAO.setSession(HibernateUtil.getSessionFactory().getCurrentSession());
        return emailDAO;
    }

}
