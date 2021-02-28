import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-producto-admin`
 *
 * VistaProductoAdmin element.
 *
 * @customElement
 * @polymer
 */
class VistaProductoAdmin extends PolymerElement {

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
        return 'vista-producto-admin';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaProductoAdmin.is, VistaProductoAdmin);
