package org.nyx.lw.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("DO")
public class Don extends Contribution{
	
}
