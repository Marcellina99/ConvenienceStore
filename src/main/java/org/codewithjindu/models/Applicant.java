package org.codewithjindu.models;

import org.codewithjindu.enums.Gender;
import org.codewithjindu.enums.Qualification;
import org.codewithjindu.enums.Role;
import org.codewithjindu.services.ApplicantService;

public class Applicant extends Person implements ApplicantService {
    int applicantId;
    Role roleApplied;
    Qualification qualification;

    public Applicant(int applicantId, String name, String phoneNumber, Gender gender, String emailAddress, Qualification qualification) {
        super(name, phoneNumber, gender, emailAddress);
        this.qualification = qualification;
    }

    public Qualification getQualification() {
        return qualification;
    }

    public Role getRoleApplied() {
        return roleApplied;
    }


    public void setRoleApplied(Role roleApplied) {
        this.roleApplied = roleApplied;
    }

    public void setQualification(Qualification qualification) {
        this.qualification = qualification;
    }

    @Override
    public String toString() {
        return "Applicant{" + super.toString() +
                " roleApplied=" + roleApplied +
                ", qualification=" + qualification +
                '}';
    }

    //method
    @Override
    public String apply(Store store, Role role) {
        this.roleApplied = role;
        store.getApplicantList().add(this);
        return this.getName() + " successfully applied for the role of "
                + role.toString().toLowerCase() + " in "
                + store.getStoreName().toLowerCase();
    }
}
