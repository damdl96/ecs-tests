import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Id;
import javax.persistence.Version;

public class XTax {

    private Object id;
    private String tax;
    private String typeFactor;
    private String version;
    private String createdBy;
    private String updatedBy;
    private BigDecimal tasaOCuota;
    private BigDecimal amount;
    private BigDecimal base;
    private boolean trasladado;
    private boolean local;
    private boolean active;
    private Date created;
    private Date updated;

    public XTax() {
    }

    public Object getId() {
        return id;
    }

    public void setId(Object id) {
        this.id = id;
    }

    public String getTax() {
        return tax;
    }

    public void setTax(String tax) {
        this.tax = tax;
    }

    public String getTypeFactor() {
        return typeFactor;
    }

    public void setTypeFactor(String typeFactor) {
        this.typeFactor = typeFactor;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public BigDecimal getTasaOCuota() {
        return tasaOCuota;
    }

    public void setTasaOCuota(BigDecimal tasaOCuota) {
        this.tasaOCuota = tasaOCuota;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getBase() {
        return base;
    }

    public void setBase(BigDecimal base) {
        this.base = base;
    }

    public boolean isTrasladado() {
        return trasladado;
    }

    public void setTrasladado(boolean trasladado) {
        this.trasladado = trasladado;
    }

    public boolean isLocal() {
        return local;
    }

    public void setLocal(boolean local) {
        this.local = local;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

}
