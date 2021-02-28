import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-buscar-producto-admin`
 *
 * VistaBuscarProductoAdmin element.
 *
 * @customElement
 * @polymer
 */
class VistaBuscarProductoAdmin extends PolymerElement {

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
        return 'vista-buscar-producto-admin';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaBuscarProductoAdmin.is, VistaBuscarProductoAdmin);
