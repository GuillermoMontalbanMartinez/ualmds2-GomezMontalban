import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-productos-mas-vendidos-admin`
 *
 * VistaProductosMasVendidosAdmin element.
 *
 * @customElement
 * @polymer
 */
class VistaProductosMasVendidosAdmin extends PolymerElement {

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
        return 'vista-productos-mas-vendidos-admin';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaProductosMasVendidosAdmin.is, VistaProductosMasVendidosAdmin);
