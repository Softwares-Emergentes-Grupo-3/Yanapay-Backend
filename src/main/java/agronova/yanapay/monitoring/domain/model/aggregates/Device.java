package agronova.yanapay.monitoring.domain.model.aggregates;

import agronova.yanapay.shared.domain.model.aggregates.BaseDomainModel;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "devices")
public class Device extends BaseDomainModel {
    @Column(name = "device_code", unique = true, nullable = false)
    private String deviceCode;

    @Column(name = "is_online", nullable = false)
    private boolean isOnline;

    public Device() {
        super();
        this.deviceCode = UUID.randomUUID().toString();
        this.isOnline = false;
    }

    public Device(String deviceCode) {
        super();
        this.deviceCode = deviceCode;
        this.isOnline = false;
    }

    public Device update(String code, boolean isOnline) {
        this.deviceCode = code;
        this.isOnline = isOnline;

        return this;
    }
}
