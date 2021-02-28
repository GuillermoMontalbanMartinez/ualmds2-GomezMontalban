import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-correo-admin`
 *
 * VistaCorreoAdmin element.
 *
 * @customElement
 * @polymer
 */
class VistaCorreoAdmin extends PolymerElement {

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
        return 'vista-correo-admin';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaCorreoAdmin.is, VistaCorreoAdmin);
