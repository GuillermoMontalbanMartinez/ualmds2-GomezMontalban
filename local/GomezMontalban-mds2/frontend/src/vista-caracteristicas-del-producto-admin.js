import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-caracteristicas-del-producto-admin`
 *
 * VistaCaracteristicasDelProductoAdmin element.
 *
 * @customElement
 * @polymer
 */
class VistaCaracteristicasDelProductoAdmin extends PolymerElement {

    static get template() {
        return html`
            <style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
        `;
    }

    static get is() {
        return 'vista-caracteristicas-del-producto-admin';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaCaracteristicasDelProductoAdmin.is, VistaCaracteristicasDelProductoAdmin);
