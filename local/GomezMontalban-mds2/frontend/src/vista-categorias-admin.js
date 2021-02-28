import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-categorias-admin`
 *
 * VistaCategoriasAdmin element.
 *
 * @customElement
 * @polymer
 */
class VistaCategoriasAdmin extends PolymerElement {

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
        return 'vista-categorias-admin';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaCategoriasAdmin.is, VistaCategoriasAdmin);
