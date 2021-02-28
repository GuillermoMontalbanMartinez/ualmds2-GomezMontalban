import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-compras-admin`
 *
 * VistaComprasAdmin element.
 *
 * @customElement
 * @polymer
 */
class VistaComprasAdmin extends PolymerElement {

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
        return 'vista-compras-admin';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaComprasAdmin.is, VistaComprasAdmin);
