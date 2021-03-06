/**
 * Code generated by Microsoft (R) AutoRest Code Generator 1.2.2.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.keyvault.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The contacts for the vault certificates.
 */
public class Contacts {
    /**
     * Identifier for the contacts collection.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /**
     * The contact list for the vault certificates.
     */
    @JsonProperty(value = "contacts")
    private List<Contact> contactList;

    /**
     * Get the id value.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the contactList value.
     *
     * @return the contactList value
     */
    public List<Contact> contactList() {
        return this.contactList;
    }

    /**
     * Set the contactList value.
     *
     * @param contactList the contactList value to set
     * @return the Contacts object itself.
     */
    public Contacts withContactList(List<Contact> contactList) {
        this.contactList = contactList;
        return this;
    }

}
