import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-compra-admin`
 *
 * VistaCompraAdmin element.
 *
 * @customElement
 * @polymer
 */
class VistaCompraAdmin extends PolymerElement {

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
        return 'vista-compra-admin';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaCompraAdmin.is, VistaCompraAdmin);
